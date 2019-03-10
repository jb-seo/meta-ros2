# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The run command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli ros2pkg"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/crystal/${PN}/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d509b49ba02b13642bb8159e380c3a3c"
SRC_URI[sha256sum] = "f0aad3bd70be47c0d33ca3c00594b3815d896aabe91298e6bc6e5023b184863d"
S = "${WORKDIR}/ros2cli-release-release-crystal-${PN}-0.6.3-0"

inherit catkin
