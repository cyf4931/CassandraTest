package com.dbtest.serviceImpl;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Service;

import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import com.dbtest.Bean.Person;
import com.dbtest.repository.PersonRepository;
import com.dbtest.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private CassandraOperations cassandraOperations;

    @Override
    public void test() {
        // 通过Repository查询
        Iterable<Person> iterable = personRepository.findAll();
        Iterator<Person> it = iterable.iterator();
        System.out.println("==>findAll:");
        while (it.hasNext()) {
            Person p = it.next();
            System.out.println(p.toString());
        }

        // 通过Repository 自定义查询查询
        // List<Person> list = personRepository.findByIdAndName("1", "one");
        Iterable<Person> list = personRepository.findAll();
        System.out.println("==>findByIdAndName:");
        for (Person person : list) {
            System.out.println(person.toString());
        }
        // 通过cassandraOperations查询
        Select select = QueryBuilder.select().from("person");
        select.where(QueryBuilder.eq("id", "1"));
        Person person = cassandraOperations.selectOne(select, Person.class);
        System.out.println("==>cassandraOperations:");
        System.out.println(person.toString());

    }

	@Override
	public void selectPersonById() {
		Optional<Person> person = personRepository.findById("1");
		System.out.println(person.get().toString());
	}

	@Override
	public void addPerson() {
		Person person = new Person("1","cyf",24);
		personRepository.save(person);
	}

}