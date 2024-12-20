# Observer design pattern (behavioral)

The Observer design pattern is useful when independent components rely on the same data object(s) and need to be notified of any changes in the data state.

This example simulates a front-end project for an audio editing application. It has a very complex main screen, full of sliders, knobs, input and output components [like this](https://i.pcmag.com/imagery/roundups/00XVABPc9FVmXg9i9kh0IEw-11.fit_lim.size_768x.jpg). Imagine we have to update all those components each time a change in the audio track occurs. But not only the track; changes in the project settings can also trigger updates on them. We could use the Observer design pattern for that, as different components (UI widgets) depend on the same data objects (audio track and project settings) and must be notified of any changes in the data.

### About the code

Package `com.audio.ui.widgets` contains all the complex UI components tailored specifically for an audio editing application. I added just a few, but usually an app like this would have dozens of them. Note that in a real-life scenario, this package would also contain UI components that are not Observers. Package `com.audio.data` contains the application’s core shared data objects. `Audio` represents the current track being edited, with its state affected by multiple widgets. `ProjectSettings` manages the project properties, some of which may trigger visual updates. Lastly, `MainGui` class contains the logic for building the main screen front-end.
