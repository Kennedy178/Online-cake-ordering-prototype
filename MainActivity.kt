class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        val vanillaCakeLayout: LinearLayout = findViewById(R.id.vanillaCakeLayout)
        val chocolateCakeLayout: LinearLayout = findViewById(R.id.chocolateCakeLayout)
        // Other cake option layouts

        // Set onClickListeners for cake options
        vanillaCakeLayout.setOnClickListener {
            // Add vanilla cake to cart or perform action
        }

        chocolateCakeLayout.setOnClickListener {
            // Add chocolate cake to cart or perform action
        }

        // Handle Add to Cart button click
        val cartButton: Button = findViewById(R.id.cartButton)
        cartButton.setOnClickListener {
            // Add selected items to cart or navigate to cart activity
        }

        // Handle Checkout button click
        val checkoutButton: Button = findViewById(R.id.checkoutButton)
        checkoutButton.setOnClickListener {
            // Proceed to checkout or navigate to checkout activity
        }

        // Handle Contact Us button click
        val contactButton: Button = findViewById(R.id.contactButton)
        contactButton.setOnClickListener {
            // Open contact options or navigate to contact activity
        }
    }
}
