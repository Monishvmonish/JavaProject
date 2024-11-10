# Inventory Management System - README

## Project Overview
The **Inventory Management System** is a desktop application developed in **Java** using **Java Swing** for the graphical user interface (GUI) and **MySQL** for database management. This system is designed to assist small to medium-sized businesses in efficiently managing their inventory, tracking product details, and maintaining accurate stock levels.

## Features
- **User Authentication**: Two user roles (Administrator and Employee) with secure login.
- **Product Management**: Add, update, delete, and view products in the inventory.
- **Stock Tracking**: Real-time updates on stock levels with alerts for low inventory.
- **Sales Management**: Record and manage sales transactions while automatically updating stock levels.
- **Customer Management**: Maintain records of customers and their purchase history.
- **Supplier Management**: Track supplier information and manage orders.

## Prerequisites
Before running the application, ensure you have the following installed:
- Java JDK 8 or later
- MySQL Server
- MySQL Connector/J for database connectivity
- An IDE (e.g., NetBeans)

## Installation Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/inventory-management-system.git
   ```
   
2. **Set Up the Database**:
   - Execute the provided SQL script `Inventory.sql` to create necessary tables in your MySQL database.

3. **Configure Database Connection**:
   - Open `DatabaseConnection.java` and update the connection details (username, password) according to your MySQL setup.

4. **Compile and Run the Application**:
   - Compile the project in your IDE.
   - Run `Main.java` to start the application.

## Usage
- Launch the application and log in using your credentials.
- Navigate through the GUI to manage products, sales, customers, and suppliers.
- Use search features to quickly find specific items or records.

## Code Structure
The project follows a modular architecture with distinct layers:
- **UI Layer**: Contains all Java Swing components for user interaction.
- **Business Logic Layer**: Implements core functionalities like CRUD operations.
- **Data Access Layer**: Manages database interactions using JDBC.

## Contribution Guidelines
Contributions are welcome! If you have suggestions or improvements:
1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes and push them to your forked repository.
4. Open a pull request for review.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

---

This README provides a comprehensive overview of the Inventory Management System project, guiding users through installation, usage, and contribution processes while outlining its key features and structure.

Citations:
[1] https://projectgurukul.org/java-inventory-management-system-project/
[2] https://copyassignment.com/inventory-management-system-project-in-java/
[3] https://colbygattycreates.com/index.php/2666-2/
[4] https://github.com/Adnan25z/JavaSwingInventoryManagementSystem
[5] https://github.com/AsjadIqbal/InventoryManagementSystem
[6] https://codewithcurious.com/projects/inventory-management-system-java/
[7] https://projectworlds.in/inventory-management-system-java-mysql-netbeans-project-with-source-code/
[8] https://www.youtube.com/watch?v=QoBzRvut0HA
