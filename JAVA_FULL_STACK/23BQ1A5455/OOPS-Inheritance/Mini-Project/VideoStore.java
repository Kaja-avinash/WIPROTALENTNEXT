public class VideoStore {

    private Video[] store;
    private int count;

    // Constructor
    public VideoStore() {
        store = new Video[100];
        count = 0;
    }

    // Add a new video
    public void addVideo(String name) {

        if (count < store.length) {
            store[count] = new Video(name);
            count++;
            System.out.println("Video \"" + name + "\" added successfully.");
        } else {
            System.out.println("Video Store is Full.");
        }

    }

    // Search video by name
    private Video findVideo(String name) {

        for (int i = 0; i < count; i++) {

            if (store[i].getName().equalsIgnoreCase(name)) {
                return store[i];
            }

        }

        return null;
    }
    // Check out a video
    public void doCheckout(String name) {

        Video video = findVideo(name);

        if (video != null) {
            video.doCheckout();
            System.out.println("Video \"" + name + "\" checked out successfully.");
        } else {
            System.out.println("Video not found.");
        }

    }

    // Return a video
    public void doReturn(String name) {

        Video video = findVideo(name);

        if (video != null) {
            video.doReturn();
            System.out.println("Video \"" + name + "\" returned successfully.");
        } else {
            System.out.println("Video not found.");
        }

    }

    // Receive rating
    public void receiveRating(String name, int rating) {

        Video video = findVideo(name);

        if (video != null) {
            video.receiveRating(rating);
            System.out.println("Rating \"" + rating + "\" has been mapped to the Video \"" + name + "\".");
        } else {
            System.out.println("Video not found.");
        }

    }

    // List inventory
    public void listInventory() {

        System.out.println("--------------------------------------------------------");
        System.out.printf("%-20s %-18s %-10s%n", "Video Name", "Checkout Status", "Rating");
        System.out.println("--------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-20s %-18b %-10d%n",
                    store[i].getName(),
                    store[i].getCheckout(),
                    store[i].getRating());
        }

        System.out.println("--------------------------------------------------------");

    }

}