# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Code shared on static and dynamic type support of rmw_fastrtps_cpp."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " rcutils rmw fastrtps"
SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/crystal/rmw_fastrtps_shared_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a011b753bf37f750ce7cc7bfb41ac24"
SRC_URI[sha256sum] = "083f2877dbc3f9b4b27dc2e6d9c5810d86c59307552a99af63d12865ef22f236"
S = "${WORKDIR}/rmw_fastrtps-release-release-crystal-rmw_fastrtps_shared_cpp-0.6.1-0"

inherit ament
