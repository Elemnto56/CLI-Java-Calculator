package calculator.misc;

public class Rudeness {
    String[] insults = {"Did I ask for a novel, Shakespeare? Type a number, not your life story",
"That ain’t a number, dumbass. Try again before I uninstall your brain",
"Bro typed hieroglyphics instead of digits. I’m not decoding that crap",
"Type a number, not whatever the hell that keyboard vomit was",
"You had one job, and you still fumbled it. A number, moron, not your imaginary friend’s name",
"What part of 'enter a number' made you think words were okay? Get it together, alphabet boy",
"Jesus tap-dancing Christ, it’s like you’re allergic to numerals",
"Unless that was your phone number, I don’t give a damn. Just type a single number, you absolute gremlin",
"This isn’t a spelling bee, you inbred calculator failure. I said NUMBERS",
"If braincells were currency, you couldn’t even count to one. Type. A. Damn. Number",
"I asked for a number, not whatever that dictionary-diarrhea was. Go again, smoothbrain",
"Keep typing words instead of numbers and I'll personally brick your keyboard, one key at a time"

};
    public String RandomInsult() {
        int index = (int)((Math.random()) * insults.length);
        return insults[index];
    }
}
