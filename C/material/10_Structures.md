# 📌 Structures in C

## 1. Introduction to Structures
A **structure** (`struct`) in C is a user-defined data type that allows grouping variables of different types under one name.

### Syntax:
```c
struct StructureName {
    data_type member1;
    data_type member2;
    ...
};
```

### Example:
```c
struct Student {
    char name[50];
    int age;
    float gpa;
};
```

## 2. Declaring and Initializing Structures

### a) Declaring Structure Variables
```c
struct Student student1;
```

### b) Initializing a Structure
```c
struct Student student1 = {"Hamin Lee", 20, 3.75};
```

### c) Accessing Structure Members
```c
#include <stdio.h>
struct Student {
    char name[50];
    int age;
    float gpa;
};

int main() {
    struct Student s1 = {"Hamin Lee", 20, 3.75};
    printf("Name: %s\n", s1.name);
    printf("Age: %d\n", s1.age);
    printf("GPA: %.2f\n", s1.gpa);
    return 0;
}
```
**Output:**
```
Name: Hamin Lee
Age: 20
GPA: 3.75
```

## 3. Array of Structures
```c
struct Student students[2] = {
    {"Hamin Lee", 20, 3.75},
    {"Jaemin Lee", 21, 3.60}
};
```

## 4. Nested Structures
```c
struct Date {
    int day, month, year;
};

struct Student {
    char name[50];
    struct Date dob;
};
```

## 5. Pointer to Structures
```c
struct Student s = {"Hamin Lee", 20, 3.75};
struct Student *ptr = &s;
printf("Name: %s\n", ptr->name);
```

## 6. Dynamic Memory Allocation for Structures
```c
#include <stdio.h>
#include <stdlib.h>
struct Student {
    char name[50];
    int age;
    float gpa;
};

int main() {
    struct Student *s = (struct Student *)malloc(sizeof(struct Student));
    s->age = 20;
    s->gpa = 3.75;
    printf("Age: %d, GPA: %.2f\n", s->age, s->gpa);
    free(s);
    return 0;
}
```

## 7. Conclusion
- **Structures allow grouping of different data types.**
- **Can be accessed using dot (`.`) and arrow (`->`) operators.**
- **Supports nesting and dynamic allocation.**