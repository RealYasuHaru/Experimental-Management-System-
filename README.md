下面都是ai写的，这个是我大一的小组作业，发上来供大家赏玩和参考
The following content is written by AI. This project was a group assignment during my freshman year of college. It is shared here for everyone's entertainment and reference.
# 实验管理系统 (Experimental Management System)

## 项目简介 / Project Introduction
实验管理系统是一个基于Java的桌面应用程序，用于高效管理实验信息和用户数据。它支持实验的创建、删除和查询，并为学生、教师和管理员提供不同的操作权限。系统采用Swing图形界面和MySQL数据库，具备良好的扩展性和易用性。  
The Experimental Management System is a Java-based desktop application for efficiently managing experimental information and user data. It supports experiment creation, deletion, and querying, and provides different operational permissions for students, teachers, and administrators. The system uses a Swing GUI and MySQL database, offering good scalability and usability.

## 功能特性 / Features
- **实验管理**  
  - 创建实验 (Create experiments)  
  - 删除实验 (Delete experiments)  
  - 查询实验 (Query experiments) 
- **用户管理**  
  - 支持学生、教师和管理员三种角色 (Supports Student, Teacher, and Admin roles)  
  - 管理员可修改密码 (Admins can change passwords)  
- **图形界面**  
  - 基于Swing的登录界面 (Login interface based on Swing)  
  - 支持用户登录和注册 (Supports user login and registration)
## 技术栈 / Technology Stack
- **Java**：开发语言  
- **MySQL**：数据库管理系统  
- **Swing**：图形用户界面库  

## 数据库结构 / Database Structure
数据库名称：`experimental_management_system`  
Tables:
- **Experiment**：存储实验信息，字段包括`id`、`name`、`content`、`request`等。  
- **User**：存储用户信息，字段包括`id`、`password`、`name`、`sex`、`age`、`city`、`type`等。  

## 如何运行 / How to Run
### 环境准备 / Environment Setup
1. 安装Java开发环境（JDK 1.8及以上）。  
   Install Java Development Kit (JDK 1.8 or above).  
2. 安装MySQL数据库，并创建`experimental_management_system`数据库。  
   Install MySQL and create the `experimental_management_system` database.  
3. 配置数据库连接信息（见`DbUtil.java`）。  
   Configure the database connection in `DbUtil.java`.  

### 运行项目 / Running the Project
1. 使用IDE（如IntelliJ IDEA或Eclipse）打开项目。  
   Open the project using an IDE (e.g., IntelliJ IDEA or Eclipse).  
2. 运行`LoginFrame.java`启动登录界面。  
   Run `LoginFrame.java` to start the login interface.  
3. 使用管理员或教师账号登录测试功能。  
   Log in with an admin or teacher account to test the features.  

## 待实现功能 / Future Work
- 完善注册功能 (Implement registration functionality)  
- 添加实验查询和修改功能 (Add experiment querying and editing features)  
- 优化数据库连接性能 (Optimize database connection performance)  
- 增加用户权限管理 (Implement user permission management)  

## 项目结构 / Project Structure
ExperimentalManagementSystem/
├── src/
│   ├── Experiment/
│   │   ├── Experiment.java
│   │   ├── ExperimentDao.java
│   ├── mysql/
│   │   ├── DbUtil.java
│   ├── Role/
│   │   ├── Admin.java
│   │   ├── Student.java
│   │   ├── Teacher.java
│   │   ├── User.java
│   ├── view/
│   │   ├── LoginFrame.java
## 贡献指南 / Contribution Guidelines
欢迎贡献代码或提出改进建议！请遵循以下步骤：  
We welcome contributions and suggestions! Please follow these steps:
1. Fork项目。  
   Fork the project.  
2. 创建新分支并提交代码。  
   Create a new branch and commit your changes.  
3. 提交Pull Request并等待审核。  
   Submit a Pull Request and wait for review.  

## 联系方式 / Contact
如有问题或建议，请联系项目维护者：[a1984905327@163.com]  
For questions or suggestions, please contact the project maintainer: [a1984905327@163.com]


感谢您的关注和支持！  
Thank you for your interest and support!
