### CVE Scan Summary
| Severity | Count |
| -------- | ----- |
| HIGH     | 3     |
| MEDIUM   | 14    |
| LOW      | 2     |
| Total    | 19    |
------------------------------

### Target: application/pom.xml
### Language Package CVE Recommendations


| Library                                          | Old Version | New Version | Total CVEs fixed | Action                                                                                                                                                  |
| ------------------------------------------------ | ----------- | ----------- | ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| org.springframework.boot:spring-boot-starter-web | 3.3.0       | 3.3.5       | 8                | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yay5ib290OnNwcmluZy1ib290LXN0YXJ0ZXItd2VifjMuMy4wfjMuMy41) |

<details>

 <summary>   &nbsp;&nbsp; Child library </summary>

- | Library                                   | Old Version | New Version | Score | CVEs fixed | CVE Ids                        | Action                                                                                                                                                                                                                             |
  | ----------------------------------------- | ----------- | ----------- | ----- | ---------- | ------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | org.springframework:spring-webmvc         | 6.1.8       | 6.1.14      | 24    | 2          | CVE-2024-38819, CVE-2024-38816 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctd2VibXZjfjYuMS44fjYuMS4xNA)                 |
  | org.springframework:spring-context        | 6.1.8       | 6.1.14      | 18    | 2          | CVE-2024-38820, CVE-2024-38827 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctY29udGV4dH42LjEuOH42LjEuMTQ)                |
  | org.apache.tomcat.embed:tomcat-embed-core | 10.1.24     |  10.1.25    | 16    | 1          | CVE-2024-34750                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLmFwYWNoZS50b21jYXQuZW1iZWQ6dG9tY2F0LWVtYmVkLWNvcmV-MTAuMS4yNH4gMTAuMS4yNQ) |
  | org.springframework:spring-web            | 6.1.8       |  6.1.12     | 13    | 1          | CVE-2024-38809                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctd2VifjYuMS44fiA2LjEuMTI)                    |
  | org.springframework:spring-expression     | 6.1.8       | 6.1.14      | 13    | 1          | CVE-2024-38827                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctZXhwcmVzc2lvbn42LjEuOH42LjEuMTQ)            |
  | org.springframework:spring-beans          | 6.1.8       | 6.1.14      | 13    | 1          | CVE-2024-38827                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-web&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctYmVhbnN-Ni4xLjh-Ni4xLjE0)                   |

</details>



| Library                                               | Old Version | New Version | Total CVEs fixed | Action                                                                                                                                                  |
| ----------------------------------------------------- | ----------- | ----------- | ---------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------- |
| org.springframework.boot:spring-boot-starter-actuator | 3.3.0       |             | 2                | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yay5ib290OnNwcmluZy1ib290LXN0YXJ0ZXItYWN0dWF0b3J-My4zLjB-) |

<details>

 <summary>   &nbsp;&nbsp; Child library </summary>

- | Library                     | Old Version | New Version | Score | CVEs fixed | CVE Ids                        | Action                                                                                                                                                                                                          |
  | --------------------------- | ----------- | ----------- | ----- | ---------- | ------------------------------ | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | ch.qos.logback:logback-core | 1.5.6       | 1.5.13      | 15    | 2          | CVE-2024-12798, CVE-2024-12801 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-actuator&libraryUpgrade=Y2gucW9zLmxvZ2JhY2s6bG9nYmFjay1jb3JlfjEuNS42fjEuNS4xMw) |

</details>



| Library                                           | Old Version | New Version | Total CVEs fixed | Action                                                                                                                                                    |
| ------------------------------------------------- | ----------- | ----------- | ---------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| org.springframework.boot:spring-boot-starter-test | 3.3.0       | 3.3.5       | 1                | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yay5ib290OnNwcmluZy1ib290LXN0YXJ0ZXItdGVzdH4zLjMuMH4zLjMuNQ) |

<details>

 <summary>   &nbsp;&nbsp; Child library </summary>

- | Library                         | Old Version | New Version | Score | CVEs fixed | CVE Ids        | Action                                                                                                                                                                                                           |
  | ------------------------------- | ----------- | ----------- | ----- | ---------- | -------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | org.springframework:spring-core | 6.1.8       | 6.1.14      | 13    | 1          | CVE-2024-38827 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot-starter-test&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctY29yZX42LjEuOH42LjEuMTQ) |

</details>

------------------------------

### Target: library/pom.xml
### Language Package CVE Recommendations


| Library                              | Old Version | New Version | Total CVEs fixed | Action                                                                                                                                    |
| ------------------------------------ | ----------- | ----------- | ---------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| org.springframework.boot:spring-boot | 3.2.2       | 3.2.11      | 5                | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yay5ib290OnNwcmluZy1ib290fjMuMi4yfjMuMi4xMQ) |

<details>

 <summary>   &nbsp;&nbsp; Child library </summary>

- | Library                               | Old Version | New Version | Score | CVEs fixed | CVE Ids                        | Action                                                                                                                                                                                                      |
  | ------------------------------------- | ----------- | ----------- | ----- | ---------- | ------------------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | org.springframework:spring-context    | 6.1.3       | 6.1.14      | 18    | 2          | CVE-2024-38820, CVE-2024-38827 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctY29udGV4dH42LjEuM342LjEuMTQ)     |
  | org.springframework:spring-expression | 6.1.3       | 6.1.14      | 13    | 1          | CVE-2024-38827                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctZXhwcmVzc2lvbn42LjEuM342LjEuMTQ) |
  | org.springframework:spring-beans      | 6.1.3       | 6.1.14      | 13    | 1          | CVE-2024-38827                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctYmVhbnN-Ni4xLjN-Ni4xLjE0)        |
  | org.springframework:spring-core       | 6.1.3       | 6.1.14      | 13    | 1          | CVE-2024-38827                 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=org.springframework.boot:spring-boot&libraryUpgrade=b3JnLnNwcmluZ2ZyYW1ld29yazpzcHJpbmctY29yZX42LjEuM342LjEuMTQ)         |

</details>

------------------------------

### Target: pom.xml
### Language Package CVE Recommendations


| Library                | Old Version | New Version    | Total CVEs fixed | Action                                                                                                                                |
| ---------------------- | ----------- | -------------- | ---------------- | ------------------------------------------------------------------------------------------------------------------------------------- |
| com.google.guava:guava | 24.1-jre    | 24.1.1-android | 1                | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&libraryUpgrade=Y29tLmdvb2dsZS5ndWF2YTpndWF2YX4yNC4xLWpyZX4yNC4xLjEtYW5kcm9pZA) |

<details>

 <summary>   &nbsp;&nbsp; Child library </summary>

- | Library                | Old Version | New Version    | Score | CVEs fixed | CVE Ids        | Action                                                                                                                                                                                   |
  | ---------------------- | ----------- | -------------- | ----- | ---------- | -------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
  | com.google.guava:guava | 24.1-jre    | 24.1.1-android | 13    | 1          | CVE-2018-10237 | [Fix](http://3.7.143.148:8080/v1/workflow?repoName=cve&fixType=child&parentLibName=com.google.guava:guava&libraryUpgrade=Y29tLmdvb2dsZS5ndWF2YTpndWF2YX4yNC4xLWpyZX4yNC4xLjEtYW5kcm9pZA) |

</details>

------------------------------
### OS Package CVE Recommendations
| Type        | Number of CVEs | Action |
| ----------- | -------------- | ------ |
| OS Packages | 0              | -      |
------------------------------
