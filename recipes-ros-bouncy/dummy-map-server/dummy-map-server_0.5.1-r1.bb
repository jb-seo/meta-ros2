# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy map server node"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake nav-msgs rclcpp"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/dummy_map_server/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "065ab7cc359f94b568c372d2c488dc75"
SRC_URI[sha256sum] = "1177c875fe71c7be91ec8dcbcd93aee4b7430798fdbd9b454b0fe0702f6daf2c"
S = "${WORKDIR}/demos-release-release-bouncy-dummy_map_server-0.5.1-1"

inherit catkin
