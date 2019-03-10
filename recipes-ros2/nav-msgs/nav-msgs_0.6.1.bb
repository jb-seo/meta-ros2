# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some navigation related message and service definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/crystal/nav_msgs/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d8649f134c0f8ef4a1249e7e73993dbc"
SRC_URI[sha256sum] = "628eb72829db8cc3288b945e20524504398fb5da7925338dddb25a809976113f"
S = "${WORKDIR}/common_interfaces-release-release-crystal-nav_msgs-0.6.1-0"

inherit catkin
