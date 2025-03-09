# Shopping List Management Program 🛒

A simple Python program to manage a shopping list. Users can view, add, and remove items from the list. ✨

## Features 🚀

- 📋 Display the shopping list
- ➕ Add new items to the list
- ❌ Remove items from the list

## Folder Structure 📁

```
📦 shopping-list-management
 ┣ 📜 shopping_list.py   # Main Python program
 ┗ 📜 README.md          # Documentation file
```

## Usage ▶️

### Run the program 🏃‍♂️💨

```bash
python shopping_list.py
```

## Code Explanation 🧐

### Display Shopping List 📜

- Uses `enumerate()` to display items with numbering.
- If the list is empty, a message is displayed.

```python
if shopping_list:
    for i, item in enumerate(shopping_list, start=1):
        print(f'{i}. {item["item_name"]} ({item["quantity"]})')
else:
    print("The shopping list is still empty")
```

### Add Item 🛍️

- Takes user input for `item_name` and `quantity`.
- Appends a new dictionary to the `shopping_list`.

```python
item_name = input("Enter the name of the item to be added: ")
quantity = input("Enter the quantity: ")
shopping_list.append({'item_name': item_name, 'quantity': quantity})
```

### Remove Item 🗑️

- Displays the list first.
- Ensures the input is within a valid range before deleting an item.

```python
shopping_list_remove = int(input("Enter the number of the item to be removed: "))
if 1 <= shopping_list_remove <= len(shopping_list):
    del shopping_list[shopping_list_remove - 1]
    print(f'Item no {shopping_list_remove} has been successfully removed')
else:
    print("Invalid number")
```

### Exit Program 🔚

```python
elif choice == '4':
    break
```

## Contributing 🤝

Feel free to fork this repository and submit a pull request if you want to improve this project! 🚀

