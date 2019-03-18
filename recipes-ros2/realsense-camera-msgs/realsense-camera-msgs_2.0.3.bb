# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing realsense camera messages definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " builtin-interfaces rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros2_intel_realsense-release/archive/release/crystal/realsense_camera_msgs/2.0.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b1ad6b0e70e85fd4800714460c815c27"
SRC_URI[sha256sum] = "bbf211ae9823bcb1d68f9c1f2d75b506154350a7037f8f578e0ba347ad9412e5"
S = "${WORKDIR}/ros2_intel_realsense-release-release-crystal-realsense_camera_msgs-2.0.3-0"

inherit ament pythonpath-insane
