DESCRIPTION = "A small image just capable of starting roscore."

IMAGE_INSTALL = "packagegroup-core-boot ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "MIT"

inherit core-image
inherit ros_${ROS_DISTRO}

IMAGE_ROOTFS_SIZE = "8192"

IMAGE_INSTALL_append_ros = " roslaunch"
IMAGE_INSTALL_append_ros2 = " ros-core"
