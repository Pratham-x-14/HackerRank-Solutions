class GradingSystem
{
public static List<Integer> gradingStudents(List<Integer> grades) {

    List<Integer> result = new ArrayList<>();

    for(int grade : grades) {

        // If less than 38, no rounding
        if(grade < 38) {

            result.add(grade);
        }
        else {

            // Find next multiple of 5
            int nextMultiple = ((grade / 5) + 1) * 5;

            // Difference
            int diff = nextMultiple - grade;

            // Round if difference < 3
            if(diff < 3) {

                result.add(nextMultiple);
            }
            else {

                result.add(grade);
            }
        }
    }

    return result;
  }
}