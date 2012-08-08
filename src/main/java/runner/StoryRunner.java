package runner;

import domain.Student;
import org.jbehave.core.Embeddable;
import org.jbehave.core.annotations.UsingEmbedder;
import org.jbehave.core.annotations.UsingSteps;
import org.jbehave.core.embedder.Embedder;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.AnnotatedEmbedderRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.StudentSteps;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/18/12
 * Time: 10:06 AM
 */

@RunWith(AnnotatedEmbedderRunner.class)
@UsingEmbedder(embedder = Embedder.class, generateViewAfterStories = true, ignoreFailureInStories = true, ignoreFailureInView = true)
@UsingSteps(instances = { StudentSteps.class})
public class StoryRunner implements Embeddable {

    private Embedder embedder;

    public void useEmbedder(Embedder embedder) {
        this.embedder = embedder;
    }

    @Test
    public void run() {
        embedder.runStoriesAsPaths(new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(),
                asList("**/*.story"), asList("")));
    }
}
