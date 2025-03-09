# "Shopping List Management Program"

shopping_list1 = {'item_name': "rocket", 'quantity': "1"}
shopping_list2 = {'item_name': "avtur", 'quantity': "10"}

shopping_list = [shopping_list1, shopping_list2]

while True:
    print("Welcome to the Shopping List Management Program\n")
    print("Please select an option or number from the menu\n")
    print("1. Display Shopping List")
    print("2. Add Item to Shopping List")
    print("3. Remove Item from Shopping List")
    print("4. Exit")

    choice = input("Enter the option you want: ")

    if choice == '1':
        if shopping_list:
            for i, item in enumerate(shopping_list, start=1):
                print(f'{i}. {item["item_name"]} ({item["quantity"]})')

        else:
            print("The shopping list is still empty")
        
    elif choice == '2':
        item_name = input("Enter the name of the item to be added: ")
        quantity = input("Enter the quantity: ")
        shopping_list.append({'item_name': item_name, 'quantity': quantity})

        print("Item successfully added to the shopping list")
    
    elif choice == '3':
        if shopping_list:
            for i, item in enumerate(shopping_list, start=1):
                print(f'{i}. {item["item_name"]} ({item["quantity"]})')

            shopping_list_remove = int(input("Enter the number of the item to be removed: "))

            if shopping_list_remove <= len(shopping_list):
                del shopping_list[shopping_list_remove - 1]
                print(f'Item no {shopping_list_remove} has been successfully removed')
            else:
                print("Invalid number")

        else:
            print("Your shopping list is still empty")
    
    elif choice == '4':
        break

    else:
        print("The number you entered is not valid")
