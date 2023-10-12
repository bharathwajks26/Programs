import numpy as np
import scipy.stats as stats
dgroup = np.array([5.1, 4.8, 6.2, 5.7, 4.9, 5.5, 6.8, 5.3, 5.9, 6.5, 4.4, 5.1, 6.0, 5.7, 6.3, 5.6, 5.8, 4.7, 6.2, 5.9,
                       5.2, 6.1, 5.5, 5.0, 6.4, 5.6, 6.2, 5.4, 6.7, 4.9, 5.6, 6.3, 5.8, 6.0, 4.8, 5.9, 5.3, 6.1, 5.4, 4.7,
                       6.5, 5.2, 6.7, 5.8, 5.5, 5.0, 6.3, 5.6])
pgroup = np.array([2.3, 2.6, 2.8, 2.4, 2.1, 2.7, 2.5, 2.2, 2.9, 2.4, 2.6, 2.3, 2.7, 2.5, 2.8, 2.6, 2.4, 2.2, 2.1, 2.7,
                          2.3, 2.4, 2.5, 2.6, 2.2, 2.8, 2.4, 2.5, 2.3, 2.6, 2.7, 2.5, 2.4, 2.9, 2.2, 2.3, 2.7, 2.5, 2.8,
                          2.1, 2.6, 2.4, 2.5, 2.3, 2.7, 2.2, 2.9])
con_lvl = 0.95
drug_mean = np.mean(dgroup)
drug_std = np.std(dgroup, ddof=1)  
drug_n = len(dgroup)
drug_mof = stats.t.ppf((1 + con_lvl) / 2, df=drug_n - 1) * (drug_std / np.sqrt(drug_n))
drug_ci = (drug_mean - drug_mof, drug_mean + drug_mof)

pmean = np.mean(pgroup)
pstd = np.std(pgroup, ddof=1)
placebo_n = len(pgroup)
p_mof = stats.t.ppf((1 + con_lvl) / 2, df=placebo_n - 1) * (pstd / np.sqrt(placebo_n))
placebo_ci = (pmean - p_mof, pmean + p_mof)

print(f"95% Confidence Interval for Drug Group: ({drug_ci[0]:.2f}, {drug_ci[1]:.2f})")
print(f"95% Confidence Interval for Placebo Group: ({placebo_ci[0]:.2f}, {placebo_ci[1]:.2f})")


'''
sample output 
95% Confidence Interval for Drug Group: (5.49, 5.84)
95% Confidence Interval for Placebo Group: (2.42, 2.56)
'''