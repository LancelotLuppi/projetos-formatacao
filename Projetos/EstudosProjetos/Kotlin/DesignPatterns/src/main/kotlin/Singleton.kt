class Singleton {
    object AppAnalytics {

        private var count: Int = 0

        fun trackUser() {
            count++
            println("Tracking user...")
        }
        fun totalTracks() {
            println("Track User called $count times")
        }
    }
}