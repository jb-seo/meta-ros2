# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The srv command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ros2cli"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8303a35b7f44f3d9cf683ad09eea9ad4"
SRC_URI[sha256sum] = "040b4584b2d5be3758aa4e6d4bfcb112ca849fd57a2ec6a90b130bb7a7e8546d"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"

inherit ros
inherit setuptools3


