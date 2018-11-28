package io.github.spair.repoxbot.dto

data class PullRequest(
    val action: PullRequestAction,
    val author: String,
    val number: Int,
    val title: String,
    val link: String,
    val diffLink: String,
    val body: String
)

enum class PullRequestAction {
    OPENED, EDITED, CLOSED, MERGED, UNDEFINED
}
