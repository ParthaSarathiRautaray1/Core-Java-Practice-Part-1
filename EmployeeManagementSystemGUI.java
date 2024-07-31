import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

public class EmployeeManagementSystemGUI extends JFrame implements ActionListener {
    private ArrayList<Employee> employees;
    private JTextField nameField, idField, salaryField, searchField;
    private JTextArea displayArea;

    public EmployeeManagementSystemGUI() {
        employees = new ArrayList<>();

        setTitle("Employee Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel nameLabel = new JLabel("Name:");
        panel.add(nameLabel);
        nameField = new JTextField();
        panel.add(nameField);

        JLabel idLabel = new JLabel("ID:");
        panel.add(idLabel);
        idField = new JTextField();
        panel.add(idField);

        JLabel salaryLabel = new JLabel("Salary:");
        panel.add(salaryLabel);
        salaryField = new JTextField();
        panel.add(salaryField);

        JButton addButton = new JButton("Add Employee");
        addButton.addActionListener(this);
        panel.add(addButton);

        JButton updateButton = new JButton("Update Salary");
        updateButton.addActionListener(this);
        panel.add(updateButton);

        JButton deleteButton = new JButton("Delete Employee");
        deleteButton.addActionListener(this);
        panel.add(deleteButton);

        JLabel searchLabel = new JLabel("Search Employee by ID:");
        panel.add(searchLabel);
        searchField = new JTextField();
        panel.add(searchField);

        JButton searchButton = new JButton("Search Employee");
        searchButton.addActionListener(this);
        panel.add(searchButton);

        displayArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(displayArea);
        panel.add(scrollPane);

        getContentPane().add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();
        switch (actionCommand) {
            case "Add Employee":
                addEmployee();
                break;
            case "Update Salary":
                updateEmployeeSalary();
                break;
            case "Delete Employee":
                deleteEmployee();
                break;
            case "Search Employee":
                searchEmployee();
                break;
        }
    }

    private void addEmployee() {
        String name = nameField.getText();
        int id = Integer.parseInt(idField.getText());
        double salary = Double.parseDouble(salaryField.getText());

        Employee employee = new Employee(name, id, salary);
        employees.add(employee);
        displayArea.append("Employee added successfully: " + employee.toString() + "\n");
    }

    private void updateEmployeeSalary() {
        int id = Integer.parseInt(searchField.getText());

        Employee employeeToUpdate = findEmployeeById(id);

        if (employeeToUpdate == null) {
            displayArea.append("Employee not found.\n");
            return;
        }

        double newSalary = Double.parseDouble(salaryField.getText());
        employeeToUpdate.setSalary(newSalary);
        displayArea.append("Salary updated successfully for employee ID " + id + ".\n");
    }

    private void deleteEmployee() {
        int id = Integer.parseInt(searchField.getText());

        Employee employeeToRemove = findEmployeeById(id);

        if (employeeToRemove == null) {
            displayArea.append("Employee not found.\n");
            return;
        }

        employees.remove(employeeToRemove);
        displayArea.append("Employee with ID " + id + " removed successfully.\n");
    }

    private void searchEmployee() {
        int id = Integer.parseInt(searchField.getText());

        Employee employee = findEmployeeById(id);

        if (employee == null) {
            displayArea.append("Employee not found.\n");
        } else {
            displayArea.append("Employee found:\n" + employee.toString() + "\n");
        }
    }

    private Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new EmployeeManagementSystemGUI();
    }
}