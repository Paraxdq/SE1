public class Project {

	String[][] strings;

	public Project(String[][] strings) {
		this.strings = strings;
	}

	public boolean isWellSorted(String[] seq) {
		int length = seq.length;

		if (seq.length <= 1) {
			return false;
		}

		for (int i = 0; i < length; i++) {

			for (int j = 0; j < strings.length; j++) {
				String a = strings[j][0];
				String b = strings[j][1];

				if (b == seq[i]) {
					for (int k = i; k >= 0; k--) {

						if (seq[k] == a) {
							break;
						}

						if (k == 0) {
							return false;
						}
					}
				}

				if (i != j && j < seq.length && seq[i] == seq[j]) {
					return false;
				}
			}
		}

		return true;
	}
}
