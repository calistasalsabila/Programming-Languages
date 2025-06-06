void main() {
  int? age = null;

  // double ageDouble = age.toDouble(); error

  if (age != null) {
    double ageDouble = age.toDouble();
    print(age);
  }
}
