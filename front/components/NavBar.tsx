import Link from "next/link";
import { Button } from "./ui/button";

export default async function NavBar() {
    return (
        <div className="h-[60px] bg-primary w-full flex justify-between items-center px-4 text-secondary">
            <div>
                <h1 className="text-2xl font-bold">UTutor</h1>
            </div>
            <div>
                <Link href={"/"}>
                    <Button className="text-primary" variant={"outline"}>Log In</Button>
                </Link>
            </div>
        </div>
    )
   
}