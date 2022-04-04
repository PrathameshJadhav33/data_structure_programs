import java.util.*;

class Student {
  String name;
  Integer id;
  int score;
  String scholarshipscheme;
  public Object scholorshipScheme;

  public Student(String name, Integer id, int score) {
    this.name = name;
    this.score = score;
    this.id = id;
    if (score < 90) {
      this.scholarshipscheme = "no scheme";
    }

    else if (score >= 90 && score < 95) {
      this.scholarshipscheme = "Scheme b";
    }

    else {
      this.scholarshipscheme = "Scheme a";
    }
  }

  @Override
  public String toString() {
    return "[Student{" +
        "name=" + name + ", id=" + id + ", score=" + score + ", scholarshipscheme=" + scholarshipscheme + "}]";
  }
}

class StudentClassImpl {
  static HashMap<Integer, Student> hm = new HashMap<Integer, Student>();
  static {
    hm.put(111, new Student("Alan", 111, 99));

    hm.put(222, new Student("Jennifer", 222, 100));

    hm.put(333, new Student("Aarya7", 333, 98));

    hm.put(444, new Student("Jen", 444, 93));

    hm.put(555, new Student("Jack", 555, 55));
  }

  public void addstudent(Student std) {
    hm.put(std.id, std);
  }

  public boolean deletestudent(int id) {
    if (hm.remove(id) == null) {
      return false;
    } else {
      return true;
    }

    // write your code here for returning true if the student deleted wrt the id
    // passed else false
  }

  public ArrayList<Student> showStudentDetails(String scholarshipscheme) {
    // write your code here to return an ArrayList containing the student details
    // according to the scholarship scheme
    String scheme = scholarshipscheme;
    ArrayList<Student> result = new ArrayList<Student>();
    ArrayList<Student> hmValues = new ArrayList<Student>(hm.values());

    for (Student s : hmValues) {
      if ((s.scholarshipscheme).equals(scheme)) {
        result.add(s);
      }
    }
    return result;

  }

}

class Source {
  public static void main(String[] args) {
    String scheme;
    int id;
    StudentClassImpl obj1 = new StudentClassImpl();
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> resultprint = new ArrayList<Student>();

    try {
      scheme = sc.nextLine();
      id = sc.nextInt();

      // students with gievn scheme will be printed here
      resultprint = obj1.showStudentDetails(scheme);
      for (Student s : resultprint) {
        System.out.println(s);
      }

      // return value of deleteStudent will be printed here
      System.out.println(obj1.deletestudent(id));
    } catch (Exception e) {
      e.printStackTrace();
      sc.close();
    }

  }

}
