# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tests package for rosbag2"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake ament-index-cpp"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/rosbag2_tests/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "07f4755e60ade34de440f77287a86efa"
SRC_URI[sha256sum] = "f7a6ca68931bd9d21b9099cd34c1c7a3c74e777400d791e7e2b716702bd89f69"
S = "${WORKDIR}/rosbag2-release-release-crystal-rosbag2_tests-0.0.6-0"

inherit catkin
