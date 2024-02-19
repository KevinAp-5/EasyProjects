package ReverseString;

public class ReverseString {
  public String stringToReverse;

  public ReverseString(String string) {
    this.stringToReverse = string;
  }

  public ReverseString() {
  }

  public void setStringToReverse(String string) {
    this.stringToReverse = string;
  }

  public String revert() {
    if (this.stringToReverse.isEmpty() || this.stringToReverse.length() == 1) {
      return this.stringToReverse;
    }

    char[] string = this.stringToReverse.toCharArray();
    char[] newString = new char[string.length];

    int counter = string.length - 1;
    for (int x = 0; x < string.length; x++) {
      newString[x] = string[counter--];

    }

    return String.valueOf(newString);
  }

  public String revert(String stringado) {
    if (stringado.isEmpty() || stringado.length() == 1) {
      return stringado;
    }

    char[] string = stringado.toCharArray();
    char[] newString = new char[string.length];

    int counter = string.length;
    for (int x = 0; x < string.length; x++) {
      newString[x] = string[counter--];
    }

    return String.valueOf(newString);
  }

}
