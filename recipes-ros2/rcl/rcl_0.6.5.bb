# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The ROS client library common implementation.     This package contains an API which builds on the ROS middleware API and is optionally built upon by the other ROS client libraries."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-cmake-ros rcl-interfaces rcl-logging-noop rcutils rmw rmw-implementation rosidl-default-runtime rosidl-generator-c"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/crystal/${PN}/0.6.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "119ad5707fc096df08be06c7b006c43d"
SRC_URI[sha256sum] = "f14ddc8b99fa0628792237579736220f0114689ea3ad49b90057d462bffe00c7"
S = "${WORKDIR}/${PN}-release-release-crystal-${PN}-0.6.5-0"

inherit catkin
