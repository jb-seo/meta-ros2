# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Vendor package for concurrent queues from moodycamel"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/shared_queues_vendor/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "744059dee1e156f70c9bfbf687c5cc06"
SRC_URI[sha256sum] = "6f5a5d1327e9666390241dc61c13cfbc6656c7de6dbfe8a2b4296ce0c1146e33"
S = "${WORKDIR}/rosbag2-release-release-crystal-shared_queues_vendor-0.0.6-0"

inherit catkin
