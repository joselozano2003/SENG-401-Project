import { Button } from "../ui/button";

export default async function Hero() {
    return (
       <div className="flex flex-col justify-center items-center h-[calc(100vh-60px)] [&>*]:m-1">
            <h1 className="font-bold text-5xl">UTutor</h1>
            <p>Find a tutor, become a tutor</p>
            <Button>Get Started</Button>
       </div>
    )
}