# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "poco-vendor rcutils rmw rmw-connext-cpp rmw-fastrtps-cpp rmw-implementation-cmake rmw-opensplice-cpp poco"
SRC_URI = "https://github.com/ros2-gbp/rmw_implementation-release/archive/release/bouncy/rmw_implementation/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b0b99fe49b2ef75f440699eb25841c8"
SRC_URI[sha256sum] = "fd7b8bb67e04c312a0b00ed8ba54b23ce6aea443078bd6366f21e530150d68b9"
S = "${WORKDIR}/rmw_implementation-release-release-bouncy-rmw_implementation-0.5.1-0"

inherit ros
inherit ament


