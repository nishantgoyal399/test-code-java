# Adactin Hotel Booking Automation Project
![Java](https://img.shields.io/badge/Java-17-blue)
![Maven](https://img.shields.io/badge/Maven-Build-Success-brightgreen)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)
---

## 📝 Overview

This project automates the hotel booking functionality on the [Adactin](https://adactinhotelapp.com/HotelAppBuild2/) platform using **Selenium WebDriver**, **TestNG**, and **Java**. It includes comprehensive test cases covering:

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
   git clone https://github.com/mansigarg10/adactin-hotel-services
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
/test-output/extentReports/index.html
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

## 🤝 Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.  
For major changes, please open an issue first to discuss what you'd like to change.

> You can also suggest enhancements for tests, reporting, or refactoring strategies.

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👩‍💻 Author

**Mansi Garg**

---
