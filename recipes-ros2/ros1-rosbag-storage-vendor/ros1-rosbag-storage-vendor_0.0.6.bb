# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Vendor package for rosbag_storage of ROS1"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake boost bzip2 git console-bridge libgpgme-dev libssl-dev pkgconfig pluginlib ros1-bridge"
SRC_URI = "https://github.com/ros2-gbp/rosbag2-release/archive/release/crystal/ros1_rosbag_storage_vendor/0.0.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0cda7f8f611167a92ce3660671466db3"
SRC_URI[sha256sum] = "38eda84740c0379aba5b3e417d2d44744eb02398476e6c8965dd4b437cc71c8a"
S = "${WORKDIR}/rosbag2-release-release-crystal-ros1_rosbag_storage_vendor-0.0.6-0"

inherit catkin
