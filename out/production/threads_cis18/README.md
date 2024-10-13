# threads_cis18

Analysis:

When the code in this project is run, the hash codes for the 5 threads are all different indicating that the threads are
creating different instances of the Singleton class. This makes sense seeing as we are using the lazy initialization of
the Singleton. If we made the Singleton thread safe, we would see that the hash codes for the 5 threads would become
identical indicating that they are all accessing the same instance of the Singleton class. 