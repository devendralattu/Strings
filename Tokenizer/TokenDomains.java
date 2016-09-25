package strings;

import java.util.StringTokenizer;

public class TokenDomains {

	public String[] domainType(String[] domains) {

		String domainTypes[] = { "organization", "commercial", "network", "information" };

		int index = 0;
		String labels[] = new String[domains.length];

		for (int i = 0; i < domains.length; i++) {
			String lastTok = new String();
/*
			char stc[] = domains[i].toCharArray();
			int pointer = domains[i].length() - 1;
			while (stc[pointer] != '.') {
				lastTok = stc[pointer--] + lastTok;
			}
*/
			StringTokenizer st = new StringTokenizer(domains[i], ".");
			while (st.hasMoreTokens()) {
				lastTok = st.nextToken();
			}

			if (lastTok.equalsIgnoreCase("org")) {
				labels[index++] = domainTypes[0];
			} else if (lastTok.equalsIgnoreCase("com")) {
				labels[index++] = domainTypes[1];
			} else if (lastTok.equalsIgnoreCase("net")) {
				labels[index++] = domainTypes[2];
			} else if (lastTok.equalsIgnoreCase("info")) {
				labels[index++] = domainTypes[3];
			}
		}

		return labels;
	}

	public static void main(String[] args) {
		
		TokenDomains t = new TokenDomains();
		String domains[] = { "a.good.info", "a.some.com", "some.a.net", "awesome.a.org", "b.info", "a.info..com" };
		String labels[] = t.domainType(domains);
		for (int i = 0; i < labels.length; i++) {
			System.out.println(labels[i]);
		}

	}

}
