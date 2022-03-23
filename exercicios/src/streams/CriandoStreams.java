package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {

		Consumer<String> print = System.out::printf;

		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);

		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);

		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);

	}

}
