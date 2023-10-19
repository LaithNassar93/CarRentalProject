package miu.edu.swe.CarRental.service;

import miu.edu.swe.CarRental.model.Customer;
import miu.edu.swe.CarRental.repository.CustomerRepository;
import miu.edu.swe.CarRental.util.MessagesBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private MessagesBean messages;

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }


    public Customer create(Customer customer) {
        if (customerRepository.existsById(customer.getCustomerNumber())) {
            throw new EntityExistsException(messages.get("customerAlreadyExists"));
        }
        return customerRepository.save(customer);
    }

    public boolean existsById(Integer id) {
        return customerRepository.existsById(id);
    }
}
