#include <iostream>
#include <map>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

struct Birthday {
    string name;
    int day;
};

class BirthdayList {
private:
    map<string, vector<Birthday>> birthdays;

public:
    void addBirthday(const string& name, int day, const string& month) {
        birthdays[month].push_back({name, day});
    }

    void searchByName(const string& name) {
        bool found = false;
        for (const auto& monthBirthdays : birthdays) {
            for (const Birthday& bday : monthBirthdays.second) {
                if (bday.name == name) {
                    cout << name << "'s birthday is on " << bday.day << " " << monthBirthdays.first << endl;
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            cout << "Sorry, no birthday found for " << name << endl;
        }
    }

    void listMonthlyBirthdays(const string& month) {
        if (birthdays.find(month) != birthdays.end()) {
            cout << "Birthdays in " << month << ":" << endl;
            for (const Birthday& bday : birthdays[month]) {
                cout << bday.day << ": " << bday.name << endl;
            }
        } else {
            cout << "No birthdays found for " << month << endl;
        }
    }
};

int main() {
    BirthdayList birthdayList;

    while (true) {
        cout << "\nMenu:" << endl;
        cout << "1. Add Birthday" << endl;
        cout << "2. Search by Name" << endl;
        cout << "3. List Monthly Birthdays" << endl;
        cout << "4. Exit" << endl;

        int choice;
        cin >> choice;

        switch (choice) {
            case 1: {
                string name, month;
                int day;
                cout << "Enter the name: ";
                cin.ignore();
                getline(cin, name);
                cout << "Enter the birth day: ";
                cin >> day;
                cout << "Enter the birth month: ";
                cin.ignore();
                getline(cin, month);
                birthdayList.addBirthday(name, day, month);
                break;
            }
            case 2: {
                string name;
                cout << "Enter the name to search: ";
                cin.ignore();
                getline(cin, name);
                birthdayList.searchByName(name);
                break;
            }
            case 3: {
                string month;
                cout << "Enter the month to list birthdays: ";
                cin.ignore();
                getline(cin, month);
                birthdayList.listMonthlyBirthdays(month);
                break;
            }
            case 4:
                return 0;
            default:
                cout << "Invalid choice. Please select again." << endl;
        }
    }

    return 0;
}
