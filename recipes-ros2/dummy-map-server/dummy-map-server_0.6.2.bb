# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy map server node"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake nav-msgs rclcpp"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/dummy_map_server/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb478da553a7b284760dc1fd5ecc5ef1"
SRC_URI[sha256sum] = "90e3e9890a0b7f07e13a20da7af26cfb7fe15ff10b324080c20f9c4a1300563b"
S = "${WORKDIR}/demos-release-release-crystal-dummy_map_server-0.6.2-0"

inherit catkin
