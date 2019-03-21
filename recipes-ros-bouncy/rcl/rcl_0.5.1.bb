# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library common implementation.     This package contains an API which builds on the ROS middleware API and is optionally built upon by the other ROS client libraries."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rcl-interfaces rcutils rmw rmw-implementation rosidl-default-runtime rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bc09eca825dbecd5654074bb70a1cc6"
SRC_URI[sha256sum] = "f43e3b33cb0786255d9359813a932b9722c2e6293924165b494947c5503259ed"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.1-0"

inherit ros
inherit ament


