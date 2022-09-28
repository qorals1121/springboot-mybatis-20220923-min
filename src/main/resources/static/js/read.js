
function getId() {
    let url = location.href;
    let id = url.substring(url.lastIndexOf("/") + 1);
     
    return id;
}

window.onload = () => {
    request();
}


function request() {
    $.ajax({
        async: false,
        type: "get",
        url: "/api/news/" + getId(),
        dataType: "json",
        success: (response) => {
            console.log(response);
            setNewsData(response.data);
        },
        error: (error) => {
            console.log(error);
        }
    })

    function setNewsData(news) {
        const newsTitle = document.querySelector(".news-title");
        const newsBroadCasting = document.querySelector(".news-broadcasting");
        const newsWriter = document.querySelector(".news-writer");
        const newsCreateDate = document.querySelector(".news-create-date");
        const newsContent = document.querySelector(".news-content");
        const newsFiles = document.querySelector(".news-files");

        newsTitle.textContent = news.title;
        newsBroadCasting.textContent = news.broadcastingName;
        newsWriter.textContent = news.writer;
        newsCreateDate.textContent = news.createDate;
        newsContent.textContent = news.content;
        newsFiles.innerHTML = `
            <a href="/download/news?originFileName=${news.fileList[0].file_origin_name}&tempFileName=${news.fileList[0].file_temp_name}">${news.fileList[0].file_origin_name}</a>
        `;
    }
}