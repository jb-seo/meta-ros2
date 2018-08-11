# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages commonly used in mapping packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=01c2bc31767ccb3a68e12f02612b2a97"

DEPENDS = "ament-cmake nav-msgs rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/navigation_msgs-release/archive/release/bouncy/map_msgs/2.0.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d556bf7c236e17c1cc669e98792ae34a"
SRC_URI[sha256sum] = "d9ded4aed0ca3f29b0d45182243d08c576b6e7d917b57816b080f618ce63c517"
S = "${WORKDIR}/navigation_msgs-release-release-bouncy-map_msgs-2.0.0-1"

inherit catkin
