package vcmsa.ci.mylu2
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.appNametextView)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
           //initialize UI elements
           val timeOfDayEditText: EditText = findViewById(R.id.searchTextView)
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
           resetButton.setOnClickListener {
               timeOfDayEditText.text.clear()
               suggestionTextView.text =""
        }
    }
}
