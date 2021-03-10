package com.dicoding.techcompany

object CompaniesData {
    private val companyNames = arrayOf("Apple Inc.",
        "Samsung Electronics Co. Ltd.",
        "Hon Hai Precision Industry Co. Ltd.",
        "Microsoft Corp.",
        "Dell Technologies Inc.",
        "Sony Corp.",
        "International Business Machines Corp.",
        "Intel Corp.",
        "Panasonic Corp.",
        "HP Inc."
        )

    private val companyDescription = arrayOf("Apple designs, manufactures, and markets a broad range of consumer technology products, including smartphones, personal computers, tablets, wearable devices, home entertainment devices, and more. Some of its most popular products include its iPhone smartphones and Mac computers. Apple also has dramatically expanded its sales from services. It operates digital content stores and recently launched several streaming services, including Apple+, a platform for on-demand entertainment content.",
        "Samsung Electronics competes with Apple and other major tech companies worldwide in key product areas. It's engaged in a broad range of businesses, including consumer electronics, information technology, and communications. The South Korean company sells mobile phones, tablets, wearable devices, virtual reality products, TVs and home theaters, computers, printers, home appliances, and more. Samsung is best known for its popular line of Galaxy smartphones.",
        "Hon Hai Precision, also known as Foxconn, is a Taiwan-based multinational electronics manufacturer. The company produces electronics and electronic components for use in the information technology, communications, automotive equipment, automobile, precision molding, and consumer electronics industries. Foxconn is a key supplier in Apple's supply chain, manufacturing a significant proportion of its iPhones.",
        "Microsoft is a global developer and licensor of software, devices, solutions, and services. The company is well known for its Windows and Office Suite software. The company is getting a growing share of its profit and revenue from cloud computing, and has developed its own cloud platform called Azure. Microsoft also owns and operates LinkedIn, the popular social networking site for job seekers.",
        "Dell designs, makes and sells hardware, information technology products, and services worldwide. The company offers desktop and laptop computers, traditional and next-generation storage solutions, and networking products. Dell also sells a cloud-native platform and cloud management solutions. Dell's best-known products are its personal computers.",
        "Sony is a Japanese technology company that designs and produces electronics products for consumer, professional, and industrial markets worldwide. The company sells products including personal computers, mobile phones, video game consoles and software, and video cameras. It also produces and distributes recorded music, as well as live-action and animated motion pictures. Sony makes and sells PlayStation, the popular video game console.",
        "IBM is an integrated solutions and services company, also referred to as \"Big Blue.\" The company offers software and IT solutions for a broad range of uses, including healthcare, financial services, Internet of Things (IoT), weather, security, as well as cloud-computing services. The company is known for its powerful Watson computer, which offers a suite of enterprise-ready AI services, applications, and tools.",
        "Intel is a premier global producer of computer chips and a provider of computing, networking, data storage, and communication solutions. The company offers platform products for the cloud, enterprise, and communication infrastructure markets. Intel provides flash memory, programmable semiconductors, and processors for notebooks, mobile devices, and desktop computers. The company is well known for its high-performance processors used in PCs worldwide by businesses and consumers.",
        "Panasonic is a Japan-based developer, manufacturer, and servicer of electronic products primarily for the consumer market. The company offers personal computers, tablets, projectors, as well as broadcast and professional AV systems. Panasonic also produces appliances such as air conditioners, TVs, refrigerators, and washing machines.",
        "HP makes and sells products used for personal computing, imaging and printing, as well as related technologies, solutions, and services. The company offers personal computers, workstations, commercial mobility devices, retail point-of-sale systems, and software. HP is perhaps best known for its printer hardware and scanning devices used by consumers and businesses globally.")

    private val companyLogo = intArrayOf(R.drawable.apple,
            R.drawable.samsung,
            R.drawable.honhai,
            R.drawable.microsoft,
            R.drawable.dell,
            R.drawable.sony,
            R.drawable.ibm,
            R.drawable.intel,
            R.drawable.panasonic,
            R.drawable.crn
        )

    val listData: ArrayList<Company>
        get() {
            val list = arrayListOf<Company>()
            for (position in companyNames.indices) {
                val company = Company()
                company.name = companyNames[position]
                company.description = companyDescription[position]
                company.photo = companyLogo[position]
                list.add(company)
            }
            return list
        }
}

