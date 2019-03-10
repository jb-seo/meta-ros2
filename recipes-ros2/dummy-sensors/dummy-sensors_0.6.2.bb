# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy sensor nodes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/dummy_sensors/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3988b787ba5aab5a113412a1214c9d65"
SRC_URI[sha256sum] = "9ad027e3adbca974a195d5ef9140a6b3042333e39d017c0520590127884e494c"
S = "${WORKDIR}/demos-release-release-crystal-dummy_sensors-0.6.2-0"

inherit catkin
