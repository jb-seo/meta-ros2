#
# Copyright (c) 2013 Stefan Herbrechtsmeier, Bielefeld University
#

ROS_BPN = "${@d.getVar('BPN', True).replace('-', '_')}"
ROS_SPN ?= "${ROS_BPN}"
ROS_SP = "${ROS_SPN}-${PV}"

FILES_${PN} += " ${datadir}"
