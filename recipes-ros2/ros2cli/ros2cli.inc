FILES_${PN}_append = " \
    ${bindir} \
    ${datadir}/${ROS_BPN} \
"

RDEPENDS_${PN}_append = " \
    python3-asyncio \
    python3-multiprocessing \
    python3-unixadmin \
    python3-pyparsing \
    python3-xmlrpc \
"
