# threads_cis18

Analysis:

When the code in this project is run, the hash codes for the 5 threads are all different indicating that the threads are
creating different instances of the Singleton class. This makes sense seeing as we are using the lazy initialization of
the Singleton. If we made the Singleton thread safe, we would see that the hash codes for the 5 threads would become
identical indicating that they are all accessing the same instance of the Singleton class. 

What I find interesting is that sometimes the hash codes will all be the same and sometimes only one or two of the hash codes
will be different from the rest. This means the threads are not always accessing different instances of the singleton class.
