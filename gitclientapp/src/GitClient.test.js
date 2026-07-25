import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

  test("should return repository names for techiesyed", async () => {

    const dummyData = [
      { id: 1, name: "Repo-One" },
      { id: 2, name: "Repo-Two" }
    ];

    axios.get.mockResolvedValue({
      data: dummyData
    });

    const repos = await GitClient.getRepositories("techiesyed");

    expect(repos).toEqual(dummyData);

  });

});