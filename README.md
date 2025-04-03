THE MUNCHIES MAP APP
1. Purpose of the app
The primary purpose of the meal planner app is to help users organize their meals efficiently by providing tools for meal scheduling (Amiri, Li and Hasan, 2023). It simplifies the user’s life as it allows you to plan your meals ahead and ensures that you have a balanced and healthy eating diet while reducing food waste (AlgoRepublic, 2025). The app also sends you notifications to let you know that new suggestions have arrived and ask if you like those suggestions (Clarkson, 2023).
2. Design considerations
Simplicity: The munchies map app can’t get any simpler than this. Just write the time of day (e.g. morning, mid-afternoon, after dinner) in small cases and the app will give you meal suggestions that you can choose from.
Consistency: The backbone of the app, which is the background, will remain the same color throughout the process of your finding your meal. Same applies to the buttons, they will remain the same color throughout. The font used in the app will also remain the same, whether it is the name of the app, the buttons, or it is the written text view.
Readability: I ensured to use big fonts on the app to accommodate all users. I made sure that the colors of the writing and the color of the background or buttons do not clash with each other, which will cause the user to not see what is written.
Feedback: Every button that you click on the app will guarantee a response to what you have clicked. If you clicked the search bar, the key board will pop up so that you can insert the time of day. Once you have entered the time of day, simply press “Show Meals” and meal suggestions will appear on your screen. To remove the suggestions, press “Reset” and the app will remove them as well as the time of day you entered so that you can enter again. If you entered something other than the time of day, the app will continue to ask you to enter the time of day.
Design for Thumbs: I have made it possible for the user to use one hand, and not even two fingers. With only your thumbs, you will be able to navigate your way around the app.


3. The design of your app
Once you have entered the app, typing the time of day (e.g. Morning, Afternoon, dinner, etc.) on the search bar will let the app know what type of meals you want and then it will give you options that you can choose from. And if wish to remove what you have searched, simply press the reset button and the meal suggestions will go away, giving you chance to put in a time of day so that the app can give you other suggestions.  
 
 
 
4. Github link
https://github.com/ST10491892/assesment1.git
5. YouTube link
https://youtu.be/4PhbvzCARtg?si=SKYoyE1zMfgLGwSr 
6. Copy of your code
package vcmsa.ci.mylu2
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

           val timeOfDayEditText: EditText = findViewById(R.id.searchView)
           val showMealButton: Button = findViewById(R.id.showMealButton)
           val resetButton: Button = findViewById(R.id.resetButton)
           val suggestionTextView: TextView = findViewById(R.id.suggestionTextView)
           //Show meal suggestions when button is clicked
           showMealButton.setOnClickListener {
               val timeOfDay = timeOfDayEditText.text.toString().trim()
               if (timeOfDay.isEmpty()) {
                   // Show a toast if no time of day is entered
                   Toast.makeText(this, "please enter a time of day", Toast.LENGTH_SHORT).show()
               } else {
                   //Display meal suggestions based on the time of day
                   val suggestion = when (timeOfDay.lowercase()) {
                       "morning" -> {
                           "breakfast: Muesli with yoghurt\nParmesan waffles with lemon ricotta"
                       }
                       "mid-morning" -> {
                           "snack: Yoghurt and Granola\nClassic waffles"
                       }
                       "Afternoon" -> {
                           "Lunch: Tuna Salad Sandwich\nSpinach and mushroom gnocchi fritter"
                       }
                       "mid-afternoon" -> {
                           "snack: Fruit smoothie\nCheese and Crackers"
                       }
                       "dinner" -> {
                           "Dinner: Lasagna\nChicken fried rice with vegetable"
                       }
                       "after dinner" -> {
                           "Dessert: Custard\nIce cream"
                       }
                       else -> {
                           "invalid time of day. Please enter a valid time"
                       }
                   }
                   //Show the meal suggestions in the TextView
                   suggestionTextView.text = suggestion
               }
           }
           //Reset the input and suggestions when reset button is clicked
           resetButton.setOnClickListener{
               timeOfDayEditText.text.clear()
               suggestionTextView.text = ""
        }
    }
}








References
AlgoRepublic (2024). Top 8 Features That Make Meal Planning Apps Profitable. Available at: https://www.linkedin.com/pulse/top-8-features-make-meal-planning-apps-profitable-algorepublic-aj4yf. (Accessed: 3 April 2025)
Amiri, M., Li, J. and Hasan, W. (2023). Personalized flexible meal planning for individuals with diet-related health concerns: System design and feasibility validation study.  JMIR Formative Research, 7, p. e46434. Available at: https://formative.jmir.org/2023/1/e46434. (Accessed: 3 April 2025)
Clarkson (2023). Top 8 features of highly profiting meal planning apps. Available at: https://www.zazz.io/blog/top-8-feature-of-highly-profiting-meal-planning-apps/#:~:text=meal%20planning%20apps%20are%20designed,process%20even%20more%20tailor%2Dmade. (Accessed 3 April 2025)
Farnsworth, R. (2021). Lasagna pictures. Available at: https://thestayathomechrf.com/amazing-lasagna-recipe/#comments. (Accessed: 3 April 2025)
