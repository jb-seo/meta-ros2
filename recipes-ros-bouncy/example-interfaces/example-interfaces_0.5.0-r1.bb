# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Contains message and service definitions used by the examples."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/example_interfaces-release/archive/release/bouncy/example_interfaces/0.5.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b8e03a99fcb1e68198ce6c8e9e0b226c"
SRC_URI[sha256sum] = "858d28603fd763f1a7edffa539320e1ab6f075ba016acc1c2a7c808fe01177ea"
S = "${WORKDIR}/example_interfaces-release-release-bouncy-example_interfaces-0.5.0-1"

inherit ros
inherit ament


