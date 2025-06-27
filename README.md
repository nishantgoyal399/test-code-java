# Adactin Hotel Booking Automation Project

---

## 📝 Overview

This project automates the hotel booking functionality on the [Adactin](http://adactinhotelapp.com/) platform using **Selenium WebDriver**, **TestNG**, and **Java**. It includes comprehensive test cases covering:

- Login
- Registration
- Room booking
- Email verification

---

## ✨ Features

- **Login Automation**: Validates user login functionality.
- **Registration Automation**: Automates the registration process and email verification.
- **Room Booking Automation**: Tests the hotel search, selection, and booking process.
- **Extent Reports Integration**: Generates detailed test execution reports.
- **Data-Driven Testing**: Uses JSON files for managing test data.

---

## 🛠 Technologies Used

| Component             | Technology         |
|----------------------|--------------------|
| Programming Language | Java               |
| Build Tool           | Maven              |
| Testing Framework    | TestNG             |
| Web Automation       | Selenium WebDriver |
| Reporting Tool       | Extent Reports     |
| JSON Parsing         | Jackson Library    |

---

## 📁 Project Structure

```
AdactinHotelAutomation/
├── src/
│   ├── main/
│   │   ├── java/                # Page objects, utilities, constants
│   │   └── resources/           # Test data in JSON format
│   └── test/
│       ├── java/                # Test classes, TestNG listeners
│       └── resources/           # TestNG XML configuration
```

---

## ✅ Prerequisites

- **Java**: JDK 17 or higher
- **Maven**: Installed and configured
- **Browser**: Microsoft Edge (used by default)
- **IDE**: IntelliJ IDEA (recommended)

---

## ⚙️ Setup Instructions

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/adactin-automation.git
   ```

2. Open the project in IntelliJ IDEA.

3. Use Maven to install dependencies:
   ```bash
   mvn clean install
   ```

4. Update JSON files in `src/main/resources/` with valid test data.

---

## 🚀 Running Tests

- To run all tests via Maven:
  ```bash
  mvn test
  ```

- To run specific tests:
  Use corresponding **TestNG XML** files located in `src/test/resources/`.

---

## 🧪 Test Data

Test data is maintained as JSON files:

| File Name              | Purpose                |
|------------------------|------------------------|
| `LoginDetails.json`    | Login credentials      |
| `BookingDetails.json`  | Hotel booking details  |
| `RegisterDetails.json` | User registration info |

---

## 📊 Reporting

Test execution reports are generated using **Extent Reports** and saved at:

```
extentReports/index.html
```

Make sure the screenshot paths in the reports are valid and accessible.

---

## 📌 Key Classes

### 🖥 Pages

- `LoginPage` – Handles login functionality
- `SearchHotelPage` – Automates hotel search
- `SelectHotelPage` – Automates hotel selection
- `BookHotelPage` – Automates booking details
- `BookingConfirmationPage` – Validates booking confirmation
- `RegisterPage` – Handles user registration
- `EmailVerificationPage` – Validates email verification

### 🧪 Tests

- `RoomBookingTest` – Validates the end-to-end room booking flow
- `RegisterTest` – Validates user registration functionality

### 🛠 Utilities

- `AdactinConstants` – Contains constant values used across the framework
- `BaseTest` – Handles common setup/teardown methods

---

## ⚠️ Known Issues

- Ensure that the JSON test data files are properly formatted to avoid deserialization errors.
- Screenshot paths used in **Extent Reports** must be accessible to render properly.

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👩‍💻 Author

**Mansi Garg**

---
